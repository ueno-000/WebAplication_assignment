var n1 = 10;
var n2 = 2;

function sum(num1,num2)
{
	var total = num1;
	
	if(num1 < num2)
	{			
		for(var i = num1;i < num2;i++)
		{
			total += i;	
		}
		
		return　`${num1}から${num2}の合計：${total}`;	
	}
	else
	{
		return `引数エラー`;	
	}
}

alert(`引数num1:${n1},引数num2:${n2}\n${sum(n1,n2)}`);