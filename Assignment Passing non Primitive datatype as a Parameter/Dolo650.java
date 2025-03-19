class Dolo650 {
    void sell(MedicineStore medicineStore) {
        if (medicineStore != null) {
            medicineStore.description();
            System.out.println("MedicineStore is not null");
        } else {
            System.out.println("MedicineStore object is null, cannot sell medicine");
        }
    }
    static class MedicineStore {
        void description() {
            System.out.println("Dolo 650 is a fever and pain relief medicine");
        }
    }
}