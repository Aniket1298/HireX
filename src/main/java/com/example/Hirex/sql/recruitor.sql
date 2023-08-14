CREATE TABLE `recruiter` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  `company` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
)


CREATE TABLE User (
  email VARCHAR(255) NOT NULL,
  password VARCHAR(255),
  PRIMARY KEY (email)
);
