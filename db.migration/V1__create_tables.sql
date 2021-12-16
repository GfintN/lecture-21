CREATE TABLE dogs_breeds {
  id BIGINT PRIMARY KEY,
  breed VARCHAR(50) UNIQUE NOT NULL
}
CREATE TABLE dogs (
  id BIGINT PRIMARY KEY,
  name VARCHAR(30) NOT NULL,
  age SMALLINT,
  breed VARCHAR(50),
  FOREIGN KEY(breed) REFERENCES dogs_breeds(breed)
)