<div style="font-family: 'Maiandra GD';"/>

![CODOID](https://codoid.com/wp-content/uploads/2017/08/codoid-logo.png) 
![EXCEL](http://icons.iconarchive.com/icons/graphicloads/filetype/96/excel-xls-icon.png)

# <u> Fillo Examples </u>
This repository demonstrates how to use Codoid's Fillo—an Excel API for Java—to read from and write to Excel files using SQL-like queries. The examples cover common operations such as `SELECT`, `INSERT`, and `UPDATE` on .xls and .xlsx files, with or without WHERE clauses.

---

## 📌 <u> Why Use Fillo? </u>
- SQL Syntax: Fillo allows you to treat Excel sheets like database tables. Using simple SQL syntax. Use `SELECT`, `UPDATE`, and `INSERT` queries directly on Excel sheets.

- No Coordinate Mapping: No need to track `row[i]` and `column[j]`. Just use column headers as field names.

- Simplified Data-Driven Testing: Ideal for Selenium or API automation frameworks where test data is managed in Excel.

---
## 🗂️ <u> Project Structure </u>

```
Fillo-Examples
├── src/
│   └── test/
│       └── java/
│           └── (example test classes using Fillo)
├── .gitignore
├── pom.xml
└── README.MD
```


src/test: Contains example Java/TestNG classes demonstrating Fillo usage
pom.xml: Maven configuration with Fillo and TestNG dependencies
README.MD: Project documentation

---

## ⚙️ <u> Tech Stack </u>

- Java (JDK 8)
- Maven for dependency management
- Fillo (Excel API for Java)
- TestNG for running example tests

---
## 📦 <u> Maven Dependencies </u>
The project uses the following key dependencies:

```xml
<dependency>
    <groupId>com.codoid.products</groupId>
    <artifactId>fillo</artifactId>
    <version>1.23</version>
</dependency>

<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.11.0</version>
</dependency>
```
---

## 💻 <u> Code Examples </u>

### 1. <u> Fetching Data (SELECT) </u>
Retrieve values from an Excel sheet where the sheet name is treated as the table name.

```Java
Fillo fillo = new Fillo();
Connection connection = fillo.getConnection("path/to/TestData.xlsx");
String strQuery = "Select * from Sheet1 where ID=101 and Status='Active'";
Recordset recordset = connection.executeQuery(strQuery);

while (recordset.next()) 
{
    System.out.println(recordset.getField("UserName"));
}
recordset.close();
connection.close();

```

### 2. <u> Inserting Data (INSERT) </u>
Add new rows to your Excel sheet effortlessly.

```Java
Connection connection = fillo.getConnection("path/to/TestData.xlsx");
String strQuery = "INSERT INTO Sheet1(Name, Country) VALUES('Gladson', 'India')";
connection.executeUpdate(strQuery);
connection.close();
```

### 3. <u> Updating Data (UPDATE) </u>
Update specific records using a WHERE clause.

```Java
Connection connection = fillo.getConnection("path/to/TestData.xlsx");
String strQuery = "UPDATE Sheet1 SET Status='Passed' where TestCaseID='TC_001'";
connection.executeUpdate(strQuery);
connection.close();
```

## 🚀 <u> Getting Started </u>
__Prerequisites__

- Java JDK 8 or later
- Apache Maven
- An IDE such as IntelliJ IDEA or Eclipse Setup

- Clone the repository:
```sh
git clone https://github.com/GladsonAntony/Fillo-Examples.git
```

- Import the project as a Maven project in your IDE. Let Maven download the required dependencies

---

## ✅ <u> Use Cases </u>

- Data-driven testing using Excel as a lightweight data source
- Test automation frameworks needing simple Excel CRUD operations
- Proof-of-concept projects for Fillo integration

---
## 🤝 <u> Contributing </u>
Contributions are welcome! If you have improvements or additional examples:

- Fork the repository
- Create a feature branch
- Commit your changes
- Open a pull request

---
## 📄 <u> License </u>
This project is provided as an example for learning and experimentation purposes. Please refer to the Fillo library’s official license for usage terms.

---
👤 Author:  [GladsonAntony](https://github.com/GladsonAntony)


⭐ If you find this repository useful, consider starring it on GitHub
