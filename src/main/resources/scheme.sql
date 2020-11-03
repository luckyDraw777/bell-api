CREATE TABLE IF NOT EXISTS organization (
  id INTEGER                        COMMENT 'Уникальный идентификатор' PRIMARY KEY AUTO_INCREMENT,
  version    INTEGER NOT NULL       COMMENT 'Служебное поле hibernate',
  name VARCHAR(50) NOT NULL         COMMENT 'Название организации',
  full_name VARCHAR(100) NOT NULL   COMMENT 'Полное название организации',
  inn VARCHAR(10) NOT NULL          COMMENT 'ИНН',
  kpp VARCHAR(10) NOT NULL          COMMENT 'КПП',
  address VARCHAR(100) NOT NULL     COMMENT 'Адрес',
  pnone VARCHAR(20)                 COMMENT 'Номер телефона',
  is_active BIT NOT NULL            COMMENT 'Активна'
);
COMMENT ON TABLE organization IS 'Организации';



CREATE TABLE IF NOT EXISTS office (
  id INTEGER                        COMMENT 'Уникальный идентификатор' PRIMARY KEY AUTO_INCREMENT ,
  version    INTEGER NOT NULL       COMMENT 'Служебное поле hibernate',
  org_id INTEGER NOT NULL           COMMENT 'ID организации',
  name VARCHAR(50) NOT NULL         COMMENT 'Название офиса',
  address VARCHAR(100) NOT NULL     COMMENT 'Адрес офиса',
  pnone VARCHAR(20)                 COMMENT 'Номер телефона офиса',
  is_active BIT NOT NULL            COMMENT 'Активен'
);
COMMENT ON TABLE office IS 'Офисы';




CREATE TABLE IF NOT EXISTS user (
  id INTEGER                        COMMENT 'Уникальный идентификатор' PRIMARY KEY AUTO_INCREMENT ,
  version    INTEGER NOT NULL       COMMENT 'Служебное поле hibernate',
  office_id INTEGER NOT NULL        COMMENT 'ID Офиса',
  country_id INTEGER NOT NULL       COMMENT 'Гражданство',
  first_name VARCHAR(50) NOT NULL   COMMENT 'Имя',
  second_name VARCHAR(50)           COMMENT 'Фамилия',
  middle_name VARCHAR(50)           COMMENT 'Отчество',
  position VARCHAR(50) NOT NULL     COMMENT 'Должность',
  phone VARCHAR(20)                 COMMENT 'Номер телефона сотрудника',
  is_identified BIT NOT NULL        COMMENT 'Идентифицирован'
);
COMMENT ON TABLE user IS 'Сотрудники';





CREATE TABLE IF NOT EXISTS document(
  id INTEGER                        COMMENT 'Уникальный идентификатор' PRIMARY KEY,
  version    INTEGER NOT NULL       COMMENT 'Служебное поле hibernate',
  document_type_id INTEGER NOT NULL COMMENT 'Тип документа',
  document_date DATE NOT NULL       COMMENT 'Дата документа',
  document_number INTEGER NOT NULL  COMMENT 'Номер документа'
);
COMMENT ON TABLE document IS 'Документы пользователей';



CREATE TABLE IF NOT EXISTS document_type(
  id INTEGER                        COMMENT 'Уникальный идентификатор' PRIMARY KEY AUTO_INCREMENT ,
  version    INTEGER NOT NULL       COMMENT 'Служебное поле hibernate',
  name VARCHAR(255) NOT NULL        COMMENT 'Название',
  code VARCHAR(3)  NOT NULL         COMMENT 'Код документа'
);
COMMENT ON TABLE document_type IS 'Справочник документов';




CREATE TABLE IF NOT EXISTS country(
  id INTEGER                        COMMENT 'Уникальный идентификатор' PRIMARY KEY AUTO_INCREMENT ,
  version    INTEGER NOT NULL       COMMENT 'Служебное поле hibernate',
  name VARCHAR(255) NOT NULL        COMMENT 'Название',
  code VARCHAR(5) NOT NULL          COMMENT 'Код'
);
COMMENT ON TABLE country IS 'Справочник стран';





CREATE INDEX IX_Organization_Name ON organization (name, full_name);
CREATE INDEX IX_Organization_Inn_Kpp ON organization (inn, kpp);


CREATE INDEX IX_Office_Name ON office (name);
CREATE INDEX IX_Office_Org_Id ON office (org_id);
ALTER TABLE office ADD FOREIGN KEY (org_id) REFERENCES organization (id);


CREATE INDEX IX_User_Office_Id ON user (office_id);
CREATE INDEX IX_User_Country_Id ON user (country_id);
CREATE INDEX IX_User_Second_Name ON user (second_name);
ALTER TABLE user ADD FOREIGN KEY (office_id) REFERENCES office (id);
ALTER TABLE user ADD FOREIGN KEY (country_id) REFERENCES country (id);


CREATE INDEX IX_Document_Id ON document (id);
CREATE INDEX IX_Document_Number ON document (document_number);
ALTER TABLE document ADD FOREIGN KEY (id) REFERENCES user (id);
ALTER TABLE document ADD FOREIGN KEY (document_type_id) REFERENCES document_type (id);


CREATE INDEX IX_Document_Code ON document_typy (code);
CREATE INDEX IX_Country_Name ON country (name);
CREATE INDEX IX_Country_Code ON country (code);

