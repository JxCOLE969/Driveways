export class listing
{
    lid :number;
    uid :number;
    spots :number;
    active :number;
    address :string;
    description :string;
    distance :number;
    cost :number;

    constructor(lid :number, uid :number, spots :number, active :number, 
        address :string, description :string, distance :number, cost :number)
    {
        this.lid = lid;
        this.uid = uid;
        this.spots = spots;
        this.active = active;
        this.address = this.address;
        this.description = description;
        this.distance = distance;
        this.cost = cost;
    }
}