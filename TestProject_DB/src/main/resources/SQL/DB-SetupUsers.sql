
DROP TABLE IF EXISTS TestProject.USERS CASCADE;
CREATE TABLE IF NOT EXISTS TestProject.USERS (
	ID SERIAL PRIMARY KEY,
    UUID VARCHAR(36) NOT NULL,
    VERSION SERIAL NOT NULL,
    ROLE_ID INTEGER,
    EMAIL VARCHAR(200) NOT NULL,
    PASSWORD VARCHAR(200) NOT NULL,
    SALT VARCHAR(200) NOT NULL,
    FIRST_NAME VARCHAR(50) NOT NULL,
    LAST_NAME VARCHAR(50) NOT NULL,
    MOBILE_PHONE VARCHAR(50) NULL,
    STATUS SMALLINT NOT NULL,
    FAILED_LOGIN_COUNT SMALLINT,
    LAST_PASSWORD_CHANGE_AT TIMESTAMP,
    LAST_LOGIN_AT TIMESTAMP NULL,
    CREATED_BY VARCHAR(100) NOT NULL ,
    CREATED_AT TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    MODIFIED_BY VARCHAR(100) NULL,
    MODIFIED_AT TIMESTAMP NULL
);



ALTER TABLE TestProject.USERS ADD CONSTRAINT UK_USERS_EMAIL UNIQUE(EMAIL);
ALTER TABLE TestProject.USERS ADD CONSTRAINT FK_USERS_ROLE_ID FOREIGN KEY(ROLE_ID) REFERENCES TestProject.ROLES(ID);

DROP TABLE IF EXISTS TestProject.USER_AUTH_TOKENS CASCADE;
CREATE TABLE TestProject.USER_AUTH_TOKENS(
	ID BIGSERIAL PRIMARY KEY,
	VERSION SERIAL NOT NULL,
	USER_ID INTEGER NOT NULL,
	ACCESS_TOKEN VARCHAR(500) NOT NULL,
	EXPIRES_AT TIMESTAMP NOT NULL,
	LOGIN_AT TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	LOGOUT_AT TIMESTAMP,
	CREATED_BY VARCHAR(100) NOT NULL,
	CREATED_AT TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	MODIFIED_BY VARCHAR(100),
	MODIFIED_AT TIMESTAMP
);



ALTER TABLE TestProject.USER_AUTH_TOKENS ADD CONSTRAINT UK_USER_AUTH_TOKENS_ACCESS_TOKEN UNIQUE(ACCESS_TOKEN);
ALTER TABLE TestProject.USER_AUTH_TOKENS ADD CONSTRAINT
    FK_USER_AUTH_TOKENS_USER_ID FOREIGN KEY(USER_ID) REFERENCES TestProject.USERS(ID);


