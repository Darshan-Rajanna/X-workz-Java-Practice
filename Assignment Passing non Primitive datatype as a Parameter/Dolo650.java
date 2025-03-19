class Dolo650 {
    void sell(MedicineStore medicineStore) {
        if (medicineStore != null) {
            medicineStore.description();
        } else {
            System.out.println("Dolo650 object is null, cannot sell medicine");
        }
    }
    static class MedicineStore {
        void description() {
            System.out.println("Dolo 650 is a fever and pain relief medicine");
        }
    }
}