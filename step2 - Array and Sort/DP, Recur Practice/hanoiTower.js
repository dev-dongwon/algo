// 하노이의 탑 : 두 가지 규칙이 있다

// 1. 한 번에 하나의 원반만 움직일 수 있습니다.
// 2. 자신보다 작은 원반이 그 아래에 놓일 수 없습니다.
//    예를 들어 원반 3이 축에 있다면 원반 3 밑에 있는 원반은 모두 3보다 큰 숫자로 되어 있어야 합니다.

const hanoi = function(n, from, to, extra, count) {
    if (n == 1)
        console.log(`${from}에서 ${to}로 이동!`)
        
    if (n > 1) {
        hanoi(n-1, from, extra, to);
        hanoi(1, from, to, extra);
        hanoi(n-1, extra, to, from);
    }
}
    
hanoi(3, "A", "B", "C", 1);
