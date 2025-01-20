.
# Java Remind

## 1. 공백 없는 한 줄 입력 처리하기
### 입력 예시
```java
4 6
101111
101010
101011
111011
```
### 처리 방법
- `nextLine()`으로 한 줄을 통째로 읽어온 후, `charAt()`으로 각 자리 처리
- 숫자 문자를 정수로 변환할 때는 `charAt(j) - '0'` 사용
```java
String input = sc.nextLine();
for(int j=0; j<m; ++j){
    maze[i][j+1] = input.charAt(j) - '0';
    => Character.digit(input.charAt(j), 10);  // 진수변환 method로도 가능
}
```

## 2. Java에서 Queue 사용하기
### Queue 선언과 초기화
- Queue는 인터페이스이므로 LinkedList로 구현체 생성
- `Queue<타입> q = new LinkedList<>();`
```java
Queue<int[]> q = new LinkedList<int[]>();
```

### 주요 메서드
- `add()`: 요소 추가
- `poll()`: 맨 앞 요소 제거 후 반환
- `isEmpty()`: 큐가 비었는지 확인
```java
q.add(new int[]{1, 1, 1});  // x좌표, y좌표, 거리
int[] current = q.poll();    // 맨 앞 요소 꺼내기
while(!q.isEmpty()) {        // 큐가 빌 때까지 반복
    // 처리 로직
}
```

## 3. Scanner 버퍼 관리
### nextInt() 사용 후 주의사항
- `nextInt()`는 숫자만 읽고 줄바꿈 문자를 버퍼에 남김
- 이후 `nextLine()`을 사용할 때 의도치 않게 빈 문자열을 읽을 수 있음
- 해결책: `nextInt()` 사용 후 `nextLine()`을 한 번 호출하여 버퍼 비우기

### 예시 코드
```java
n = sc.nextInt();
sc.nextLine();  // 버퍼 비우기

// 이후 nextLine() 사용
for(int i=1; i<=n; ++i){
    String input = sc.nextLine();
}
```