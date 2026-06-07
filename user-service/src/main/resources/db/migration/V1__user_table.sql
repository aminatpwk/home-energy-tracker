CREATE TABLE [users]
(
    [id]                        BIGINT        NOT NULL IDENTITY (1,1) PRIMARY KEY,
    [name]                      NVARCHAR(100) NOT NULL,
    [surname]                   NVARCHAR(100),
    [email]                     NVARCHAR(100) NOT NULL,
    [address]                   NVARCHAR(MAX),
    [alerting]                  BIT           NOT NULL DEFAULT 0,
    [energy_alerting_threshold] FLOAT         NOT NULL DEFAULT 0,
    UNIQUE ([email])
);;