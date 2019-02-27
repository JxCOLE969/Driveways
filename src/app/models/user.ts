export class user
{
    uid :number;
    username :string;
    password :string;
    role :string;
    phone :string;

    constructor(uid :number, username :string, password :string, role :string, phone :string)
    {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.role = role;
        this.phone = phone;
    }
}