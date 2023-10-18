const str = "This is a Sunny day";
let ans = "";
const result = str.split(" ");

for (let i = 0; i < result.length; i++) {
    const val = reverseString(result[i]);
    ans += val;
    if (i < result.length - 1) {
        ans += " "; 
    }
}

console.log(ans);

function reverseString(str) {
    const arr = Array.from(str);
    for (let i = 0; i < str.length / 2; i++) {
        const temp = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = temp;
    }

    return arr.join('');
}
