var Array = {key1: 10, key2: 20, key3: 30};
var keyArray = ["key1", "key2", "key3"];

var randomIndex = Math.floor(Math.random() * keyArray.length);
var randomKey = keyArray[randomIndex];
var randomValue = Array[randomKey];

alert(`選択されたキー: ${randomKey}\n対応する値: ${randomValue}`);