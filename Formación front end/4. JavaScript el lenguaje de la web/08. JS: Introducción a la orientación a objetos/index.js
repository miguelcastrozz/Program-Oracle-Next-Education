import {AccountStream} from "./AccountStream.js";
import {Client} from "./Client.js";

const accountDaniela = new Client();

accountDaniela.nameClient = "Daniela";
accountDaniela.dniClient = "84646466";
accountDaniela.rutClient = "46546464";

const accountMiguel = new AccountStream();

accountMiguel.number = "1";
accountMiguel.agency = "001";
accountMiguel.client = accountDaniela;

accountMiguel.depositAccount(1000);
accountMiguel.withdrawAccount(250);

const accountMaria = new AccountStream(accountMiguel, "2", "", null);
accountMaria.setClient = accountMiguel;
accountMiguel.transactionAccount(1500, accountMaria);

console.log("Miguel's current balance: " + accountMiguel.showBalance());
console.log("Maria's current balance: " + accountMaria.showBalance());
