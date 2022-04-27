let f1 = 1;
let f2 = 1;
let sum = 0;
console.log(f1);
for (let i = 2; i <= 10; i++) {
    console.log(f2);
    let temp = f1 + f2;
    sum += f2;
    f1 = f2;
    f2 = temp;
}
console.log('Tổng các sô trong dãy Fibonacci trên là: ' + sum);
//# sourceMappingURL=main.js.map