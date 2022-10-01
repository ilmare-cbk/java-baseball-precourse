# 숫자 야구 게임

## 진행 방법

* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정

* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

---
기능목룍

### **1. 컴퓨터(상대방) 기능 구현**

- 새로운 게임이 시작되면 컴퓨터는 1~9까지 서로 다른 수로 이루어진 3자리 수를 선택한다.
- 생성된 수는 다음과 같은 조건을 만족해야된다.
    - 1~9까지의 숫자로만 이루어져 있다.
    - 3자리 수
    - 서로 다른 수

### **2. 심판(판단 로직) 기능 구현**

- 게임 플레이어(사용자)가 입력한 3자리 수와 컴퓨터가 선택한 3자리 수를 비교하여 힌트를 결정한다.
- 같은 수가 같은 자리에 있으면 스트라이크 판정
- 같은 수가 다른 자리에 있으면 볼 판정
- 같은 수가 전혀 없으면 낫싱 판정

### **3. 컨트롤러 기능 구현**

- 게임 시작/종료 처리
- 심판의 판단(힌트) 결과에 따라 게임을 지속할지, 종료할지 결정한다.

### **4. 게임 플레이어(사용자)의 입력과 심판의 판단 결과 출력 기능 구현**

- 게임 플레이어(사용자)의 3자리 수를 입력받는다.
    - 게임 플레이어(사용자)가 입력한 값은 다음 조건을 만족해야된다.
        - 1~9까지의 숫자로만 이루어져 있다.
        - 3자리수
        - 서로 다른 숫자

  `유효하지 않은 값이 입력되었을 때 IllegalArgumentException 호출`
- 심판이 판단한 결과(힌트)를 출력한다.
- 3개의 숫자를 모두 맞춰 게임이 종료되면, 게임 플레이어(사용자)로 부터 1 또는 2를 입력받는다.
    - 1을 입력받으면 새로운 게임 시작
    - 2를 입력받으면 게임 완전 종료

  `1,2 이외의 값이 입력되었을 때 IllegalArgumentException 호출`
