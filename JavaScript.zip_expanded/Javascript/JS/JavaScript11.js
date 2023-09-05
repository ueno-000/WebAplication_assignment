var array = [100, 83, 23, 58, 37];

var total = 0;
var average = 0;

for(var i = 0;i < array.length;i++)
{
	total += array[i];
}

alert(`合計：${total}\n平均：${total/array.length}`)