var array = [30, 23, 13, 49, 42];

function getMaxValue(nums) {
  var max = nums[0];

  for (var i = 1; i < nums.length; i++) {
    if (max < nums[i]) {
      max = nums[i];
    }
  }

  return max;
}

alert(`配列${array}の最大値：${getMaxValue(array)}`);
