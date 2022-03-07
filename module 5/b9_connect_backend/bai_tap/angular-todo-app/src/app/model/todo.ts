export class Todo {
  id: number;
  cardName: string;
  email: string;
  phone: string;

  constructor(id: number, cardName: string, email: string, phone: string) {
    this.id = id;
    this.cardName = cardName;
    this.email = email;
    this.phone = phone;
  }
}

