export class user
{
    uid :number;
    username :string;
    password :string;
    role :number;
    phone :string;

    constructor(uid :number, username :string, password :string, role :number, phone :string)
    {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.role = role;
        this.phone = phone;
    }
}