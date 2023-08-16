CREATE TABLE IF NOT EXISTS
    films (
    id serial PRIMARY KEY,
    title varchar(255),
    director varchar(255),
    release_year integer,
    genre varchar(255)
    );