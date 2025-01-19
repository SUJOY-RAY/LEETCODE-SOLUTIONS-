class ParkingSystem {
    vector<int> counter;
public:

    ParkingSystem(int big, int medium, int small) {
        counter={big, medium, small};
    }
    
    bool addCar(int carType) {
        return counter[--carType]-->0;
    }
};

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem* obj = new ParkingSystem(big, medium, small);
 * bool param_1 = obj->addCar(carType);
 */
