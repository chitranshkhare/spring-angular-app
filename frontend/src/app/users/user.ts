import { Book } from "../books/book";

export class User {

    id: number;
    name: string;
    username: string;
    email: string;
    mobileNo: string;
    address: string;
    books: Book[];

}