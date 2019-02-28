export class reservation
{
    rid :number;
    lid :number;
    uid :number;
    spotIndex :number;


    constructor(rid :number, lid :number, uid :number, spotIndex :number)
    {
        this.rid = rid;
        this.lid = lid;
        this.uid = uid;
        this.spotIndex = spotIndex;
    }
}