# 🧩 Problem: Mini Food-Delivery System (LLD + OOP Concepts)

You need to design a **very small version of Swiggy/Zomato** with:

* **Classes & Objects**
* **Enums**
* **Interfaces**
* **Encapsulation**
* **Abstraction**
* **Inheritance**
* **Polymorphism**

Focus more on **design quality than features**.

---

## 🎯 Core Requirement

We have:

* **Users** → Customer / DeliveryPartner
* **Orders**
* **Restaurants**
* **Payments**

You must design classes so we can:

1️⃣ Customer places an order
2️⃣ Order gets assigned to a delivery partner
3️⃣ Customer pays
4️⃣ Order status updates step-by-step

---

## 🧱 Mandatory Design Rules (this is where concepts come in…)

### 1️⃣ Abstract Class (Abstraction)

Create an abstract class:

```
User
```

Every user must have:

* id
* name
* phone
* method → `displayInfo()`

But:

👉 `User` **must not** be directly created.

Create two subclasses:

```
Customer
DeliveryPartner
```

Both **inherit from User** and implement `displayInfo()` differently.

> (Inheritance + Abstraction + Polymorphism)

---

### 2️⃣ Encapsulation

All model fields like

* id
* name
* list of orders
* earnings
* price

must be **private** and accessed using **getters/setters**.

---

### 3️⃣ Interface

Create an interface:

```
Payable
```

Methods:

```
processPayment(double amount);
```

Classes that implement Payable:

* PaymentByUPI
* PaymentByCard

> (Runtime polymorphism should happen here)

---

### 4️⃣ Enums (must use)

Create at least **two enums**:

```
OrderStatus   (PLACED, PREPARING, DISPATCHED, DELIVERED, CANCELLED)

PaymentMode   (UPI, CARD)
```

Use them inside your design.

---

### 5️⃣ Order Flow

Create a class:

```
Order
```

Fields:

* orderId
* restaurant
* customer
* deliveryPartner
* totalAmount
* status (OrderStatus)
* paymentMode (PaymentMode)

Methods:

* placeOrder()
* assignDeliveryPartner()
* updateStatus()
* completeOrder()

---

### 6️⃣ Restaurant

Simple class:

```
Restaurant
```

Fields:

* restaurantId
* name
* rating

Method:

* showMenu()

(Menu can be just a simple printed list — no need for real logic)

---

## 🏁 Example Scenario (your code should support)

1️⃣ Create a restaurant
2️⃣ Create a customer
3️⃣ Customer places order
4️⃣ Assign delivery partner
5️⃣ Customer pays with UPI
6️⃣ Order status moves → PLACED → PREPARING → DISPATCHED → DELIVERED

Each step should print meaningful logs.

---

## 💡 What I will evaluate in your solution

✔️ Proper class design
✔️ Correct use of **abstract + inheritance**
✔️ Correct use of **interface & polymorphism**
✔️ Meaningful **encapsulation**
✔️ Enum usage
✔️ Clean, readable structure

---

## ⭐ Bonus (optional — only if you want)

Add:

* cancellation logic
* delivery partner earnings
* multiple orders
