# Blackjack with Kotlin

### 요구 사항

- [객체지향 생활체조](https://developerfarm.wordpress.com/2012/02/03/object_calisthenics_summary/) 를 지킨다.

### 기능 명세

- 플레이어와 딜러는 두장의 카드를 받는다.
- 딜러는 자신의 카드 중 한장을 오픈한다.
- 딜러는 카드의 합이 17이 될 때까지 추가 카드를 뽑아야한다.
- 플레이어는 카드의 합이 21이 넘지 않는 범위 내에서 추가 카드를 받을 수도(hit), 받지 않을 수도 (stay) 있다.
- 딜러와 플레이어 중 카드의 합이 21또는, 21에 가장 가까운 숫자를 가지는 쪽이 이긴다.
- 카드는 다이아몬드, 하트, 스페이드, 클럽 무늬를 가진 A, 2, 3, 4, 5, 6, 7, 8, 9, J, Q, K 52장이다.
    - Ace는 1 (또는 11)로 계산합니다.
    - King, Queen, Jack은 각각 10으로 계산합니다.
    - 그 외의 카드는 카드에 표시된 숫자로 계산합니다.
- 용어
    - Blackjack: 처음 두 장의 카드 합이 21일 경우를 말하며 베팅 금액의 1.5 배의 Pay를 받습니다.(1.5 to 1)
    - Bust: 카드 합이 21을 초과하면 베팅 금액을 잃게 됩니다.
    - Push: 플레이어와 딜러의 각각의 카드 합이 같을 경우 서로 비기게 됩니다.

### 참고사항
- [객체지향 좀 더 이해하기 - 블랙잭 게임 구현](https://jojoldu.tistory.com/62)
