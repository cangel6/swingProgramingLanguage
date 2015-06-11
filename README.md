# swingProgramingLanguage
그네어 이해하기.

이 언어는 그분의 느낌을 조금이라도 이해해보기 위해서 만들었습니다.</br>
이런 프로그래밍 언어가 다 그렇듯이 사용하기는 복잡하고, 정작 복잡한 동작은 못하지만 그냥 재미로 보셨으면 합니다.</br>
이 언어의 규칙은 다음과 같습니다.</br>
</br>
1. 문장</br>
1-1. 문장의 구성요소는 "주어", "어휘", "부호", "명령어"가 된다.</br>
1-2. "주어"는 반드시 문장의 맨 앞에 위치하여야 되며 "은","는","이","가","을","를"의 조사 또는 "와","과"의 연결어가 붙어야 된다.</br>
1-3. 문장의 마지막에는 명령어가 위치하고 "다. "로 끝나야된다.</br>
1-4. "되다"의 변형 어휘는 값의 부호로 쓰인다.</br>
</br>
2. 주어.</br>
2-1. 문장의 주어는 변수명이 된다.</br>
2-3. 변수의 초기값은 0이다.</br>
2-4. "와", "과"로 한번에 여러 변수명을 할당할 수 있다.</br>
2-5. 조사 "은", "는" 은 변수명에 값을 할당하는 명령이다.</br>
2-6. 조사 "이", "가" 는 변수명에 값을 더하는 명령이다.</br>
2-7. 조사 "을", "를" 은 변수명에 값을 빼는 명령이다.</br>
2-8. 할당, 가산, 감산 명령어가 나온 이후의 주어는 변수명으로 사용되지 않는다.</br>
</br>
3. 어휘.</br>
3-1. 각 어휘는 띄어쓰기로 분리된다.</br>
3-2. 주어와 명령어 연산자를 제외한 어휘는 모두 변수값이 된다.</br>
3-3. 첫 어휘는 1의 값을 가지고 어휘가 붙을때마다 값은 2배가 된다.</br>
예제)아름다운 우리 나라 멋진 한국 => 1*2*2*2*2 => 16</br>
</br>
4. 부호.</br>
4-1. 부호는 "되다"의 변형어휘가 사용된다.</br>
4-2. 문장 마지막 위치에 존재하는 명령어의 경우 "되다"의 변형어미는 부호로 처리하지 않는다.</br>
4-3. 각 부호는 앞의 어휘들의 값의 부호가 된다.</br>
4-3. "되다"의 현재형/미래형인 "되고", "되어", "되면", "될" 같은 경우에는 +부호가 된다.</br>
예제)아름다운 우리 나라 멋진 한국이 되고 => (+)1x2x2x2x2 => 16</br>
4-4. "되다"의 과거형인 "되었으며", "되었고" 같은 경우에는 -부호가 된다.</br>
예제)아름다운 우리 나라 멋진 한국이 되었고 => (-)1x2x2x2x2 => -16</br>
</br>
5. 명령어.</br>
5-1. 명령어는 문장의 마지막에 위치하며 "다. "로 끝나야 된다.</br>
5-2. "알겠다"의 변형은 현재 문장에서 사용하는 변수의 숫자값을 출력한다.</br>
예제)이 언어는 사용하기가 복잡하다는 것은 이제 알겠다. => 이 언어 = 1x2x2x2 = 8 && "이 언어" 숫자 출력 => 8 출력</br>
예제)이 언어와 문장은 사용하기가 복잡하다는 것은 이제 알겠다. => 이 언어 = 문장 = 8 && "이 언어", "문장" 숫자 출력 => 88 출력</br>
5-3. "생각하다"의 변형은 현재 문장에서 사용하는 변수의 값의 아스키코드를 출력한다.</br>
예제)이 언어는 사용하기 복잡하고 이 문제를 해결함에 있어 어려움을 생각한다. => 이 언어 = 1x2x2x2x2x2x2 = 64 && "이 언어" 아스키 코드 출력 => d출력</br>
5-4. 그 외의 명령어는 무시한다. (단순 값 연산 및 대입의 기능만 한다.)</br>
</br>
Hello World!! 예제</br>
이 언어는 행정부 수장의 언어를 이해하고 그것을 알게 되고 그 마음을 알고 이제는 무엇을 해야 되는지 그 말을 다시 여기서 생각하였다. </br>
그것이 사용하게 되었고, 더 배우게 되었고, 또 자연스럽게 사용함을 알 수 있다고 생각한다. </br>
새로운 언어와 그 익숙함은 우리의 발전에 더 큰 도움과 지혜로 다가오게 되고 이제는 그 언어를 이용함에 있어 이해하게 되고 좀 더 알게 되고 무언가를 다시 느낄 것이라 생각한다. </br>
이 언어가 언제 어떻게 되고 누가 사용될 지는 이제 생각된다. </br>
새로운 것은 여러 사람에게 발전되어 가고 넓어질 거라 생각한다. </br>
이 언어를 사용함도 아직 익숙하게 사용 못하게 되어도 앞으로는 익숙하게 누군가가 알게 된다고 생각한다. </br>
그것이 언제라도 가능 할 것을 믿게 되고 그 것이 우리의 목표라 생각된다. </br>
그것이 생각하게 되었고, 우주가 나서서 도와준다고 생각한다. </br>
새로운 언어를 이제 알게 되었고 매우 기쁘다고 생각한다. </br>
그것을 사용하여 국가에 도움이 되도록 하는 것이 프로그래머라 생각한다. </br>
그래서 인터프린터와 코드는 해체하게 되고 그 과정에 국민 여러분께 진심으로 죄송하다고 생각한다. </br>
