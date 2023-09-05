var array = [100, 83, 23, 58, 37];

var total = 0;
var cnt = 0;

for(var i = 0;i < array.length;i++)
{
	if(array[i] >= 50)
	{
		total += array[i];	
		cnt++;
	}
	
	
}

alert(`合計：${total}\n平均：${total/cnt}`);