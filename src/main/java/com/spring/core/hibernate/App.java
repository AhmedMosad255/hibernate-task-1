package com.spring.core.hibernate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PlayerDAO dao = new PlayerDAO();
//        todo saving player
//        Player player = new Player();
//        player.setName("Mohamed");
//        player.setAge(22);
//        player.setStatus(true);
//        dao.savePlayer(player);
//        todo updating player
//        Long playerId = 1L;
//        Player existingPlayer = dao.getPlayerById(playerId);
//        if (existingPlayer != null) {
//            existingPlayer.setName("Ahmed-Mosaad");
//            existingPlayer.setAge(25);
//            dao.updatePlayer(existingPlayer);
//            System.out.println("Player updated Successfully");
//        }else {
//            System.out.println("Player does not exist");
//        }
//        todo get player with id
//        Long playerId = 22L;
//        Player player = dao.getPlayerById(playerId);
//        if (player != null) {
//            System.out.println("Player ID: " + player.getId());
//            System.out.println("Player Name: " + player.getName());
//            System.out.println("Player Age: " + player.getAge());
//            System.out.println("Player Status: " + (player.isStatus() ? "Active" : "Inactive"));
//        } else {
//            System.out.println("Player not found with ID: " + playerId);
//        }
//        todo deleting player with id
//        dao.deletePlayer(player);

        System.out.println("Players with name starting with 'A': " + dao.getPlayersWithNameStartingWithA().size());
        System.out.println("Players with age >= 20: " + dao.getPlayersWithAgeAbove20().size());
        System.out.println("Players with status true: " + dao.getPlayersWithStatusTrue().size());
        System.out.println("Players with even IDs: " + dao.getPlayersWithEvenId().size());
    }
}
