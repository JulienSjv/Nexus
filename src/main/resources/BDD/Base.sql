INSERT INTO `nexus`.`categories`
(`nom`)
VALUES
("Compression"),
("Media"),
("Runtime"),
("Utilities"),
("Web Browser");


INSERT INTO `nexus`.`softs`
(`nom`,`categorie_id`)
VALUES
("7-zip",1),
("WinRar",1),
("Itunes",2),
("VLC",2),
("Spotify",2),
("JAVA 8",3),
("FileZilla",4),
("NotePad++",4),
("SumatraPDF",4),
("Chrome",5),
("FireFox",5);

INSERT INTO `nexus`.`feeds`
(`color`,
`nom`,
`url`)
VALUES
("rgb(187, 33, 33)","Univer Freebox","http://www.universfreebox.com/backend.php?id_rubrique=29"),
("rgb(222, 140, 17)","NextInpact","https://www.nextinpact.com/rss/news.xml"),
("#323e55","Korben","https://korben.info/feed"),
("#08541a","Google","https://news.google.com/news/rss/settings/sections?ned=fr&hl=fr&gl=FR");