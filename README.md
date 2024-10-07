# Hibernate Task 1

This project demonstrates how to use Hibernate with Oracle Database to perform CRUD operations (Create, Read, Update, Delete) on a `Player` entity. 

## Table of Contents
- [Overview](#overview)
- [Technologies](#technologies)
- [Setup](#setup)
- [Usage](#usage)
  - [Save Player](#save-player)
  - [Update Player](#update-player)
  - [Get Player by ID](#get-player-by-id)
  - [Delete Player](#delete-player)
  - [Additional Queries](#additional-queries)
- [Contributing](#contributing)

## Overview
The purpose of this project is to demonstrate the integration of Hibernate with Oracle to manage `Player` data. The following operations are supported:
- Saving a new player
- Updating an existing player
- Fetching a player by ID
- Deleting a player
- Executing additional queries such as retrieving players by age, name, status, etc.

## Technologies
- **Java**
- **Hibernate ORM**
- **Oracle Database** (connected via Docker)
- **Maven** (for dependency management)

## Setup
To set up this project locally, follow the steps below:

1. **Oracle Database**: Ensure you have Oracle Database running. You can use Docker for this:
   ```bash
   docker run --name oracle-db -d -p 1521:1521 -e ORACLE_ALLOW_REMOTE=true oracle/database:latest
