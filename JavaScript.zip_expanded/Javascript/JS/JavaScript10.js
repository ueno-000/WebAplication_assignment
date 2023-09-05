var x = Math.floor(Math.random()*101);

function ageJudgement(x)
{
	if(x >= 0 && x <= 19)
	{
		return "1000円";
	}
	else if(x >= 20 && x <= 80)
	{
		return "2000円";
	}
	else
	{
		return "無料";
	}
}

alert(`${x}歳は${ageJudgement(x)}`);