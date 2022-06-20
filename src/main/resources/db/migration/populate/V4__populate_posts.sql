INSERT INTO posts (id, is_active, moderation_status, moderator_id, text, time, title, view_count, user_id)
VALUES (1, 1, 'ACCEPTED', 1, 'Второй пост по лайкам 1', '2022-01-21 05:21:56', 'Title:1', 355, 1),
       (2, 1, 'ACCEPTED', 1, 'Бавария', '2020-01-21 13:22:57', 'Title:2', 111, 1),
       (3, 1, 'ACCEPTED', 1, 'Барселона', '2018-01-21 11:55:57', 'Title:3', 523, 1),
       (4, 1, 'ACCEPTED', 1, 'Манчестер', '2016-01-21 14:24:57', 'Title:4', 431, 1),
       (5, 1, 'ACCEPTED', 1, 'Вот это самый новый пост', '2022-06-19 18:25:57', 'Title:5', 77, 1),
       (6, 1, 'ACCEPTED', 1, 'Спартак', '2014-01-21 03:26:57', 'Title:6', 88, 1),
       (7, 1, 'ACCEPTED', 1, 'Динамо', '2012-01-21 07:27:57', 'Title:7', 423, 1),
       (8, 1, 'ACCEPTED', 1, 'Самый старый пост', '2010-01-21 11:28:57', 'Title:8', 321, 1),
       (9, 1, 'ACCEPTED', 1, 'ЦСКА', '2008-01-21 02:29:57', 'Title:9', 5432, 1),
       (10, 1, 'ACCEPTED', 1, 'Химки', '2006-01-21 15:30:57', 'Title:10', 413, 1),
       (11, 1, 'ACCEPTED', 1, 'Челси', '2004-01-21 08:31:57', 'Title:11', 410, 1),
       (12, 1, 'ACCEPTED', 1, 'Ливерпуль', '2002-01-21 23:32:57', 'Title:12', 54, 1),
       (13, 1, 'ACCEPTED', 1, 'Рубин', '2000-01-21 11:11:57', 'Title:13', 554, 1),
       (14, 1, 'ACCEPTED', 1, 'Зенит', '1998-01-21 06:34:57', 'Title:14', 545, 1),
       (15, 1, 'ACCEPTED', 1, 'Милан', '1996-01-21 04:35:57', 'Title:15', 555, 1),

       (16, 1, 'ACCEPTED', 1, 'Интер', '2021-01-21 15:30:57', 'Title:16', 4413, 2),
       (17, 1, 'ACCEPTED', 1, 'Ювентус', '2019-01-21 06:31:57', 'Title:17', 410, 2),
       (18, 1, 'ACCEPTED', 1, 'ПСЖ', '2017-01-21 23:32:57', 'Title:18', 544, 2),
       (19, 1, 'ACCEPTED', 1, 'Краснодар', '2015-02-21 11:11:57', 'Title:19', 524, 2),
       (20, 1, 'ACCEPTED', 1, 'Сочи', '2013-01-21 06:34:57', 'Title:20', 545, 2),
       (21, 1, 'ACCEPTED', 1, 'Локомотив', '2011-01-21 02:35:57', 'Title:21', 555, 2),

       (22, 1, 'ACCEPTED', 1, 'Крылья Советов', '2009-01-21 16:30:57', 'Title:22', 423, 3),
       (23, 1, 'ACCEPTED', 1, 'Ростов', '2007-01-21 09:31:57', 'Title:23', 480, 3),
       (24, 1, 'ACCEPTED', 1, 'Ахмат', '2005-01-21 13:32:57', 'Title:24', 544, 3),
       (25, 1, 'ACCEPTED', 1, 'Терек', '2003-02-21 11:11:57', 'Title:25', 564, 3),
       (26, 1, 'ACCEPTED', 1, 'Нижний Новгород', '2001-05-21 06:34:57', 'Title:26', 645, 3),
       (27, 1, 'ACCEPTED', 1, 'Урал', '1999-01-21 02:35:57', 'Title:27', 755, 3),

       (28, 1, 'ACCEPTED', 1, 'Уфа', '2022-01-21 17:30:57', 'Title:28', 423, 4),
       (29, 1, 'ACCEPTED', 1, 'Арсенал', '2022-01-21 19:31:57', 'Title:29', 480, 4),
       (30, 1, 'ACCEPTED', 1, 'Тотенхем', '2022-01-21 14:32:57', 'Title:30', 544, 4),
       (31, 1, 'ACCEPTED', 1, 'ВестХэм', '2012-02-21 11:11:57', 'Title:31', 564, 4),
       (32, 1, 'ACCEPTED', 1, 'Ньюкасл', '2012-01-21 06:34:57', 'Title:32', 645, 4),
       (33, 1, 'ACCEPTED', 1, 'Лестер', '2012-01-21 02:35:57', 'Title:33', 755, 4),

       (34, 1, 'ACCEPTED', 1, 'Лучший пост по лайкам', '2022-01-21 17:30:57', 'Title:34', 423, 5),
       (35, 1, 'NEW', 1, 'Эвертон', '2022-01-21 19:31:57', 'Title:35', 480, 5),
       (36, 1, 'ACCEPTED', 1, 'Уотфорд', '2022-01-21 14:32:57', 'Title:36', 544, 5),
       (37, 1, 'NEW', 1, 'Наполи', '2012-02-21 11:11:57', 'Title:37', 564, 5),
       (38, 1, 'ACCEPTED', 1, 'Аталанта', '2012-05-21 06:34:57', 'Title:38', 645, 5),
       (39, 1, 'NEW', 1, 'Рома', '2012-01-21 02:35:57', 'Title:39', 755, 5),
       (40, 0, 'NEW', 1, 'Мичуганец', '2022-05-20 12:35:57', 'Title:Inactive-1', 155, 1),
       (41, 0, 'NEW', 1, 'Оренбуржец', '2022-05-20 10:35:57', 'Title:Inactive-2', 255, 1),
       (42, 0, 'NEW', 1, 'Московец', '2022-05-20 02:35:57', 'Title:Inactive-3', 355, 1),
       (43, 0, 'NEW', 1, 'Кочетовец', '2022-05-20 07:35:57', 'Title:Inactive-4', 455, 1),
       (44, 0, 'NEW', 1, 'Сургутец', '2022-05-20 09:35:57', 'Title:Inactive-5', 555, 1),

       (45, 1, 'NEW', 1, 'Тамбовец', '2022-05-20 07:35:57', 'Title:Pending-1', 145, 1),
       (46, 1, 'NEW', 1, 'Вьетнамец', '2022-05-20 07:33:57', 'Title:Pending-2', 145, 1),
       (47, 1, 'NEW', 1, 'Чеченец', '2022-05-20 07:32:57', 'Title:Pending-3', 145, 1),
       (48, 1, 'NEW', 1, 'Болгарец', '2022-05-20 07:31:57', 'Title:Pending-4', 145, 1),
       (49, 1, 'NEW', 1, 'Китаец', '2022-05-20 07:36:57', 'Title:Pending-5', 145, 1),

       (50, 1, 'DECLINED', 1, 'Монголец', '2022-05-20 07:32:57', 'Title:Declined-1', 145, 1),
       (51, 1, 'DECLINED', 1, 'Гукиц', '2022-05-20 07:31:57', 'Title:Declined-2', 145, 1),
       (52, 1, 'DECLINED', 1, 'Арабец', '2022-05-20 07:26:57', 'Title:Declined-3', 145, 1),
       (53, 1, 'DECLINED', 1, 'Цыганец', '2022-05-20 07:46:57', 'Title:Declined-4', 145, 1),
       (54, 1, 'DECLINED', 1, 'Плешивец', '2022-05-20 07:56:57', 'Title:Declined-5', 145, 1),

       (55, 1, 'ACCEPTED', 1, 'Газмяс', '2022-05-20 07:16:57', 'Title:Published-1', 45, 1),
       (56, 1, 'ACCEPTED', 1, 'Торпедо', '2022-05-20 03:56:57', 'Title:Published-2', 2145, 1),
       (57, 1, 'ACCEPTED', 1, 'Шахтёр', '2022-05-20 02:56:57', 'Title:Published-3', 345, 1),
       (58, 1, 'ACCEPTED', 1, 'ПСЖ', '2022-05-20 01:56:57', 'Title:Published-4', 165, 1),
       (59, 1, 'ACCEPTED', 1, 'Сатурн', '2022-05-21 07:56:57', 'Title:Published-5', 174, 1);

