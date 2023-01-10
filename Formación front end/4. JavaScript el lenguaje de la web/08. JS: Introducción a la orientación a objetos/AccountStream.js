export class AccountStream {

    // # privado, _ protegido,

    #client;
    number;
    #balance;
    agency;

    constructor(client, number, balance, agency) {
        this.#client = null;
        this.#balance = balance || 0;
        this._client = client;
        this._number = number;
        this._balance = balance;
        this._agency = agency;
    }

    depositAccount(value) {
        if (value >= 1000) {
            this.#balance += value;
        } else {
            console.error("Deposit minimum 1000");
        }
        return this.#balance; /* Retorna con cuanto dinero quedo la cuenta */
    }

    withdrawAccount(value) { /* values is a parameter by value */
        if (this.#balance <= value) {
            console.log("Insufficient balance");
        } else {
            this.#balance -= value;
        }
        return this.#balance;
    }

    showBalance() {
        return this.#balance;
    }

    transactionAccount(value, accountDestination) { /* accountDestination is a parameter by reference */
        this.withdrawAccount(value);
        accountDestination.depositAccount(value)
    }

    get client() {
        return this._client;
    }

    set client(value) {
        if (value instanceof Client) { /* Si el valor es una instancia de la clase Client */
            this._client = value;
        }
    }

    get number() {
        return this._number;
    }

    set number(value) {
        this._number = value;
    }

    get balance() {
        return this._balance;
    }

    set balance(value) {
        this._balance = value;
    }

    get agency() {
        return this._agency;
    }

    set agency(value) {
        this._agency = value;
    }

}
