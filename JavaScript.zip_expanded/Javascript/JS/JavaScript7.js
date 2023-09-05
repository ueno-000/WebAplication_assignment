var array = [10, 20, 30, 40, 50];

var randomIndex = Math.floor(Math.random() * array.length);
var randomElement = array[randomIndex];

alert(`${randomIndex}番目の値${randomElement}が選ばれた`);