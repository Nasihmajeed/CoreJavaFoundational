create schema snakeandladder;
use snakeandladder;
create table HISTORY (
    GameID int not null, 
    Winner varchar(100) not null,
    Loser varchar(100) not null,
    GameDate timestamp not null,
    primary key (GameID)
);
    
