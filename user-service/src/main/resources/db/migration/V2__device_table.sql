CREATE TABLE devices (
                         id BIGINT IDENTITY(1,1) NOT NULL,
                         name NVARCHAR(255),
                         type NVARCHAR(50),
                         location NVARCHAR(255),
                         user_id BIGINT,
                         CONSTRAINT PK_devices PRIMARY KEY (id),
                         CONSTRAINT FK_devices_users FOREIGN KEY (user_id)
                             REFERENCES users(id)
                             ON DELETE CASCADE
);

CREATE INDEX idx_device_user_id ON devices(user_id);