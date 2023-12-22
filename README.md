# Invoice-management-system

# Invoice Management System

Welcome to the Invoice Management System repository! This project was developed during my training period at HRC company, focusing on Business-to-Business interactions and predicting order amounts for upcoming days. The primary goal was to assist companies, like Trend, in understanding their potential future order amounts based on historical data analysis.

## Project Overview

The project is organized into three main components:

1. **Machine Learning (ML):**
   - Data Collection and Cleaning: Removal of unnecessary elements from the dataset.
   - Data Split: Division of the dataset into training and test sets (30:70 ratio).
   - Classification: Implementation of various classifiers, including Linear Regression, Decision Tree, Random Forest, etc.
   - Model Selection: XGBoost was chosen for its stable predictions, achieving an 80% accuracy on both training and test data.

2. **Backend (Java):**
   - Database Connection: Utilization of JDBC to establish a connection with the backend data.
   - Data Posting: Posting data on the local host in JSON format.
   - Package Structure: 
     - "model": Includes the invoice class.
     - "connection": For establishing JDBC connections.
     - "implementation": Implementation of all business logic.
     - "servlet": Handling API calls.

3. **Frontend:**
   - Integration: Connection of the backend with the frontend.
   - Receivables Dashboard: Development of a responsive dashboard using Material UI.
   - Features: 
     - Data Display: All data is presented in a grid format.
     - Functionality: Search, add, edit, and delete data.
     - Prediction: A "Predict" button for forecasting future order amounts.
     - Analytics View: Integration of HighCharts for an analytics view option.

## Getting Started

To get started with the Invoice Management System, follow these steps:

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/SameerShekhar2003/Invoice-management-system.git
   ```

2. **Set Up the Backend:**
   - Navigate to the "backend" directory.
   - Configure the database connection details in the `application.properties` file.
   - Build and run the Java application.

3. **Run the Frontend:**
   - Navigate to the "frontend" directory.
   - Install dependencies using `npm install`.
   - Start the development server with `npm start`.

4. **Explore the System:**
   - Open your browser and go to `http://localhost:3000` to access the Receivables Dashboard.
   - Use the various functionalities to interact with the system and explore the predicted order amounts.

## Project Structure

```
|-- backend
|   |-- src
|       |-- main
|           |-- java
|               |-- com.example
|                   |-- connection
|                   |-- implementation
|                   |-- model
|                   |-- servlet
|                   |-- Application.java
|                   |-- application.properties
|-- frontend
|   |-- public
|   |-- src
|       |-- components
|       |-- App.js
|       |-- index.js
|-- .gitignore
|-- README.md
```

Feel free to explore the individual directories for detailed information on each component.

Thank you for your interest in the Invoice Management System! If you have any questions or feedback, feel free to open an issue or contact me directly.
