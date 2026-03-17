// Composition — new inside the class
class Car {
    private Engine e = new Engine(); // you see 'new' here
}

// Association / Aggregation — passed from outside
class Doctor {
    private Patient p; // no 'new' here
    Doctor(Patient p) { this.p = p; } // passed in
}