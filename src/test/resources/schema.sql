drop table cddisk if exists;
CREATE TABLE CDDISK
(
    CDDISKID    NUMERIC     NOT NULL,
    ARTIST      VARCHAR(30)     NOT NULL,
    TITLE       VARCHAR(50)     NOT NULL,
    constraint PK_CDDISK primary key (CDDISKID)
);