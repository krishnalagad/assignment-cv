let numbers = [0, 2, 17, 6, 10, 5, 8, 1, 7, 800, 3400];
numbers.sort(function(a, b) {
    return b - a;
});
console.log(numbers);


let strings = ["apple", "banana", "cherry", "date"];
strings.sort(function(a, b) {
    return b.localeCompare(a);
});
console.log(strings);
