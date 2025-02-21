# 💄 Makeup Product Recommendation System

## 📌 Overview
The Makeup Product Recommendation System** is a **Java-based desktop application** that helps users find the **best foundation, lipstick, and eyeshadow** based on their **skin tone, skin type, and makeup preferences. This project uses **Java Swing for UI**, **SQLite for database management**, and an **AI-based matching algorithm** to recommend products.

## 🎯 Features
✅ User Profile & Preferences – Users enter their skin tone, type, and preferred makeup style  
✅ AI-Based Smart Recommendation – Suggests the best makeup products based on user input  
✅ Makeup Product Database** – Stores makeup products with details like shades, types, and brands  
✅ Wishlist & Reviews** – Users can save products and leave reviews  
✅ Admin Panel** – Manage product listings and user feedback  

## 🛠️ Technologies Used**
- Java (JDK 8+) – Core programming language
- Java Swing– User Interface development
- SQLite – Lightweight database for storing makeup products
- AI Matching Algorithm – Recommends the best makeup products

## 📂 Project Structure
``
Makeup-Recommendation/
│── src/                       # Java Source Code
│   ├── Main.java              # Main Application
│   ├── User.java              # User Model
│   ├── Product.java           # Product Model
│   ├── Recommendation.java    # AI-based Recommendation Logic
│   ├── Database.java          # Product Storage (SQLite)
│   ├── UI.java                # Java Swing UI
│── assets/                    # Images and UI Assets
│── README.md                  # Project Documentation
│── .gitignore                 # Ignore files
│── makeup.sql                 # Database Schema
```

## 🚀 Installation & Setup**
### 1️⃣ Clone the Repository**
```bash
git clone https://github.com/yourusername/Makeup-Recommendation.git
cd Makeup-Recommendation
```

### 2️⃣ Compile & Run the Java Application**
```bash
javac -d bin src/*.java
java -cp bin Main
```

### 3️⃣ Initialize the SQLite Database**
```bash
sqlite3 makeup.db < makeup.sql
```

## 🖥️ How to Use**
1. Launch the Application** using `java -cp bin Main`
2. Enter your Skin Tone & Skin Type** in the UI
3. Click "Get Recommendation"** to see the best-matching makeup products
4. Save your favorite products** or browse other recommendations

## 🔧 Future Enhancements**
🚀 AI-Based Shade Matching** using Machine Learning  
🚀 Real-Time Product Search API** for live recommendations  
🚀 E-commerce Integration** for purchasing recommended products  
🚀 Mobile App Version** for Android & iOS  

## 📜 License**
This project is **open-source** under the MIT License.

## 🙌 Contributing**
Pull requests are welcome! If you’d like to contribute:
1. Fork the repository**
2. Create a new branch** (`feature-new-functionality`)
3. Commit your changes** (`git commit -m "Added new feature"`)
4. Push to GitHub** and create a **Pull Request**

## 📬 Contact
For questions or feedback, contact ap0804@srmist.edu.in or open an issue on GitHub. 😃
