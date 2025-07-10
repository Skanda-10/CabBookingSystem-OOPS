# 🚖 Skanda Cab Booking Console (Java OOP)

A console-based Java application that simulates real-time cab booking and allocation logic based on pickup location, drop location, and time. Built fully using OOP principles.

---

## 🧠 Features

- 🚕 4 Cabs initialized and managed through a central database (`CabDB`)
- 📍 Nearest and earliest available cab selected based on location and time
- 🧾 Fare is calculated based on distance using real-time logic
- 📊 Ride history and earnings are tracked for each cab
- 🧠 Fully modular with classes like `Cab`, `DriverService`, and `FareCalculator`

---

## 📂 Project Structure

- `src/com/skanda/`
  - `Main.java` – User input, ride flow & summary
  - `Cab.java` – Cab model with properties and methods
  - `DriverService.java` – Selects nearest available cab
  - `CabDB.java` – Stores and manages list of all cabs
  - `FareCalculator.java` – Logic for fare based on distance
- `images/`
  - `cab_booking.png` – Welcome & booking input UI
  - `ride_summary.png` – Final ride history and summary
- `README.md` – You’re here ✨

---

## 📸 Screenshots

### 🟢 Welcome & Booking Input
![Cab Booking](images/Cab%20Allocation%20%26%20Ride%20Summary.png)

### 📊 Ride Summary Output
![Ride Summary](images/Welcom%20%26%20Cab%20booking.png)

---

## 💰 Fare Logic

- ₹100 base fare for the first 5 km
- ₹10 per extra km beyond that
- 15 km assumed between every two points (A–F)

---

## 🔁 Sample Ride Flow

```txt
Enter pickup location (A-F): A
Enter drop location (A-F): D
Enter pickup time (in 24hr format): 9

✅ Cab A booked. From A to D @ 9hrs | Fare: ₹250

