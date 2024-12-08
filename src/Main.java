public class Main {
    public static void main(String[] args) {

        CREATE TABLE Employee (
                ID INT not null,
                NAME VARCHAR(100) not null,
                AGE INT,
                ADDRESS VARCHAR(255),
                SALARY DECIMAL(10, 2)
        );

        ALTER TABLE Employee
        ADD CONSTRAINT pk_Employee_ID PRIMARY KEY (ID);

        CREATE TABLE Company (
                ID INT not null,
                NAME VARCHAR(100) not null,
                ADDRESS VARCHAR(255),
                PRIMARY KEY (ID)
        );

        ALTER TABLE Employee
        ADD COLUMN company_id INT,
        ADD CONSTRAINT fk_Company_id FOREIGN KEY (company_id) REFERENCES Company(ID);


        ALTER TABLE Employee
        ADD CONSTRAINT check_age CHECK (AGE > 16);

    }
}
