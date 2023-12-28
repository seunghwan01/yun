$(document).ready(function () {
    // 페이지 로드 시 저장된 라디오 버튼, 라벨, select 상태를 확인하여 스타일 적용
    const savedSexualState = localStorage.getItem('selectedSexual');
    if (savedSexualState) {
        $(`#${savedSexualState}`).prop('checked', true);
        changeColor(`${savedSexualState}Label`);
    }

    const savedLabelState = localStorage.getItem('selectedLabel');
    if (savedLabelState) {
        $(`#${savedLabelState}`).css({
            backgroundColor: '#343b4d',
            color: 'white'
        });
    }

    // 라디오 버튼 클릭 이벤트
    $('input[type="radio"]').on('change', function () {
        changeColor($(this).attr('id') + 'Label');
    });

    // 함수 정의
    function changeColor(labelId) {
        // 모든 라벨 초기화
        $('label').css({
            backgroundColor: '',
            color: ''
        });

        // 선택된 라벨 스타일 적용
        $(`#${labelId}`).css({
            backgroundColor: '#343b4d',
            color: 'white'
        });

        // 선택된 성별을 localStorage에 저장
        localStorage.setItem('selectedSexual', labelId.replace('Label', ''));

        // 선택된 라벨을 localStorage에 저장
        localStorage.setItem('selectedLabel', labelId);
    }
});