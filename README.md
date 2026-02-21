# 🚀 DailyFinance UI Automation Framework  
### Selenium + TestNG + Gradle + Allure | Production-Ready Test Architecture

<p align="center">

![Java](https://img.shields.io/badge/Java-17+-blue)
![Selenium](https://img.shields.io/badge/Selenium-WebDriver-green)
![TestNG](https://img.shields.io/badge/TestNG-Framework-red)
![Gradle](https://img.shields.io/badge/Build-Gradle-blueviolet)
![Allure](https://img.shields.io/badge/Reporting-Allure-orange)
![Architecture](https://img.shields.io/badge/Design-POM-success)

</p>

---

## 📌 Project Summary

This project demonstrates a **scalable, maintainable, and structured UI test automation framework** for the DailyFinance web application.

Designed using industry best practices, this framework showcases:

- ✔ Clean architecture using Page Object Model (POM)
- ✔ Reusable test setup structure
- ✔ Data-driven testing with JSON
- ✔ Structured test execution via TestNG
- ✔ Rich reporting with Allure
- ✔ Clear separation of concerns

This repository reflects real-world automation engineering practices suitable for enterprise-level applications.

🔗 **Repository:**  
https://github.com/ZayedIqbal/DailyFinance_Selenium_TestNG_Automation/

---

## 🎯 Business Flows Automated

The framework automates critical end-to-end user journeys:

### 👤 User Module
- New user registration
- Login with valid credentials
- Login with invalid credentials validation

### 🛠 Admin Module
- Admin login verification

### 📦 Dashboard Module
- Authenticated login validation
- Add item functionality validation

These flows represent high-impact business-critical features.

---

## 🧠 Automation Architecture

This framework follows:

- 🔹 Page Object Model (POM)
- 🔹 TestNG-based execution control
- 🔹 JSON-driven test data management
- 🔹 Centralized driver setup
- 🔹 Modular test structure

### Why This Matters?

✔ Improves maintainability  
✔ Reduces code duplication  
✔ Supports scalability  
✔ Easy to extend for CI/CD integration  
✔ Enterprise-ready structure  

---

## 🧱 Tech Stack

| Technology | Purpose |
|------------|----------|
| Java 17+ | Programming Language |
| Selenium WebDriver | UI Automation |
| TestNG | Test Execution & Assertions |
| Gradle | Dependency & Build Management |
| Allure | Advanced Reporting |
| JSON Simple | External Test Data Management |

---

## 📂 Project Structure

```
DailyFinance_Selenium_TestNG_Automation/
│
├── build.gradle
├── src/
│   ├── test/java/
│   │   ├── pages/
│   │   │   ├── LoginPage.java
|   |   |   ├── BasePage.java
│   │   │   ├── RegistrationPage.java
│   │   │   └── DashboardPage.java
│   │   │
│   │   ├── setup/
│   │   │   └── Setup.java
│   │   │
│   │   └── tests/
│   │       ├── RegistrationTest.java
│   │       ├── LoginPageTest.java
│   │       ├── DashboardTest.java
│   │       └── AdminLogin.java
│   │
│   └── test/resources/
│       ├── suite.xml
│       └── users.json
│
├── allure-results/
└── allure-report/
```

---

## ▶️ How to Execute

### Clone Repository

```bash
git clone https://github.com/ZayedIqbal/DailyFinance_Selenium_TestNG_Automation.git
cd DailyFinance_Selenium_TestNG_Automation
```

### Run All Tests

```bash
gradle clean test
```

### Run Specific Test Suite

```bash
gradle test --tests "tests.*"
```

---

## 📊 Allure Reporting

This framework integrates Allure for advanced execution insights:

- Test execution timeline
- Step-level reporting
- Failure trace visualization
- Clean dashboard summary

### Generate Report

```bash
allure generate allure-results --clean -o allure-report
```

### Serve Report

```bash
allure serve allure-results
```

---

## 📸 Allure Report Preview

Add your screenshot inside:

```
docs/allure-report.png
```

Then include:

```markdown
## 📊 Allure Report Preview
![Allure Report](docs/allure-report.png)
```

---

## 🏗 Engineering Highlights

✔ Clean and readable test structure  
✔ Separation of Test Logic & Page Actions  
✔ Data-driven test approach  
✔ Structured test prioritization  
✔ Scalable architecture  
✔ Enterprise-ready automation foundation  

---

## 📈 Future Roadmap & Enhancements

To further evolve this framework into a full enterprise-grade automation solution, the following improvements are planned:

### 🧪 1️⃣ Expand Test Coverage
- Add more positive & negative test scenarios
- Improve assertion coverage for stronger validation
- Add edge case and boundary testing
- Implement soft assertions where necessary
- Increase regression suite depth
  
### 🌐 2️⃣ REST Assured API Automation
- Integrate REST Assured for backend API validation
- Validate request/response schema
- Perform status code & response body assertions
- Add API + UI hybrid validation approach
- Support token-based authentication handling
  
### ⚡ 3️⃣ CI/CD Integration
- Integrate with GitHub Actions for automated pipeline execution
- Trigger automation on Pull Requests & main branch merge
- Generate and publish Allure reports in pipeline
- Enable automated build status badges


### 🧵 4️⃣ Parallel & Cross-Browser Execution
- Enable parallel execution via TestNG
- Add support for multiple browsers (Chrome, Firefox, Edge)
- Improve execution speed & scalability

---

> 🎯 Goal: Transform this framework into a complete UI + API enterprise automation solution.

---

## 👨‍💻 Author

**Zayed Iqbal**  
Software Quality Assurance Engineer  
  
🔗 GitHub:  
https://github.com/ZayedIqbal

---

> ⭐ If you found this framework useful, feel free to star the repository!
