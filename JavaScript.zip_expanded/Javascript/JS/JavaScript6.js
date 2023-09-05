//商品価格
var price = 3;
//支払金額
var payment = 10000;
//おつり
var change = 0;

change = payment - price;

var bill_5000 = Math.floor(change/5000);

change -= 5000*bill_5000;

var bill_1000 = Math.floor(change/1000);

change -= 1000*bill_1000;

var coin_500 = Math.floor(change/500);

change -= 500*coin_500;

var coin_100 = Math.floor(change/100);

change -= 100*coin_100;

var coin_50 = Math.floor(change/50);

change -= 50*coin_50;

var coin_10 = Math.floor(change/10);

change -= 10*coin_10;

var coin_5 = Math.floor(change/5);

change -= 5*coin_5;

var coin_1 = Math.floor(change/1);

change -= 1*coin_1;


alert(`商品価格:${price}円,支払金額:${payment}円,お釣り:${payment-price}円\n5000円：${bill_5000}枚\n1000円：${bill_1000}枚\n500円：${coin_500}枚\n100円：${coin_100}枚\n50円：${coin_50}枚\n10円：${coin_10}枚\n5円：${coin_5}枚\n1円：${coin_1}枚`);


