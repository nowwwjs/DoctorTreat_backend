document.addEventListener('DOMContentLoaded', function() {
    const doctors = [
    // 의사 정보를 여기에 추가합니다.
    { name: "송아성", department: "이비인후과", address: "서울시 *** ****", phone: "02-0000-0000" },
    { name: "정승환", department: "이비인후과", address: "수원시 *** ****", phone: "031-1111-0000" },
    { name: "김승진", department: "이비인후과", address: "안양시 *** ****", phone: "031-3333-0000" },
    { name: "양혁수", department: "이비인후과", address: "성남시 *** ****", phone: "031-4444-0000" },
    { name: "이재서", department: "이비인후과", address: "화성시 *** ****", phone: "031-5555-0000" },
    { name: "정재우", department: "이비인후과", address: "서울시 *** ****", phone: "02-6666-0000" },
    { name: "김영선", department: "이비인후과", address: "용인시 *** ****", phone: "031-7777-0000" },
    { name: "김민채", department: "이비인후과", address: "시흥시 *** ****", phone: "031-8888-0000" },
    { name: "강수정", department: "이비인후과", address: "서울시 *** ****", phone: "02-9999-0000" },
    { name: "정시우", department: "이비인후과", address: "시흥시 *** ****", phone: "031-0000-1111" },
    { name: "이기철", department: "이비인후과", address: "화성시 *** ****", phone: "031-0000-2222" },
    { name: "신승민", department: "이비인후과", address: "서울시 *** ****", phone: "02-0000-3333" },
    { name: "김규열", department: "이비인후과", address: "서울시 *** ****", phone: "02-0000-4444" },
    { name: "서원우", department: "이비인후과", address: "부천시 *** ****", phone: "032-0000-5555" },
    { name: "송아성", department: "이비인후과", address: "서울시 *** ****", phone: "02-0000-0000" },
    { name: "정승환", department: "이비인후과", address: "수원시 *** ****", phone: "031-1111-0000" },
    { name: "김승진", department: "이비인후과", address: "안양시 *** ****", phone: "031-3333-0000" },
    { name: "양혁수", department: "이비인후과", address: "성남시 *** ****", phone: "031-4444-0000" },
    { name: "이재서", department: "이비인후과", address: "화성시 *** ****", phone: "031-5555-0000" },
    { name: "정재우", department: "이비인후과", address: "서울시 *** ****", phone: "02-6666-0000" },
    { name: "김영선", department: "이비인후과", address: "용인시 *** ****", phone: "031-7777-0000" },
    { name: "김민채", department: "이비인후과", address: "시흥시 *** ****", phone: "031-8888-0000" },
    { name: "강수정", department: "이비인후과", address: "서울시 *** ****", phone: "02-9999-0000" },
    { name: "정시우", department: "이비인후과", address: "시흥시 *** ****", phone: "031-0000-1111" },
    { name: "이기철", department: "이비인후과", address: "화성시 *** ****", phone: "031-0000-2222" },
    { name: "신승민", department: "이비인후과", address: "서울시 *** ****", phone: "02-0000-3333" },
    { name: "김규열", department: "이비인후과", address: "서울시 *** ****", phone: "02-0000-4444" },
    { name: "서원우", department: "이비인후과", address: "부천시 *** ****", phone: "032-0000-5555" },
    { name: "송아성", department: "이비인후과", address: "서울시 *** ****", phone: "02-0000-0000" },
    { name: "정승환", department: "이비인후과", address: "수원시 *** ****", phone: "031-1111-0000" },
    { name: "김승진", department: "이비인후과", address: "안양시 *** ****", phone: "031-3333-0000" },
    { name: "양혁수", department: "이비인후과", address: "성남시 *** ****", phone: "031-4444-0000" },
    { name: "이재서", department: "이비인후과", address: "화성시 *** ****", phone: "031-5555-0000" },
    { name: "정재우", department: "이비인후과", address: "서울시 *** ****", phone: "02-6666-0000" },
    { name: "김영선", department: "이비인후과", address: "용인시 *** ****", phone: "031-7777-0000" },
    { name: "김민채", department: "이비인후과", address: "시흥시 *** ****", phone: "031-8888-0000" },
    { name: "강수정", department: "이비인후과", address: "서울시 *** ****", phone: "02-9999-0000" },
    { name: "정시우", department: "이비인후과", address: "시흥시 *** ****", phone: "031-0000-1111" },
    { name: "이기철", department: "이비인후과", address: "화성시 *** ****", phone: "031-0000-2222" },
    { name: "신승민", department: "이비인후과", address: "서울시 *** ****", phone: "02-0000-3333" },
    { name: "김규열", department: "이비인후과", address: "서울시 *** ****", phone: "02-0000-4444" },
    { name: "서원우", department: "이비인후과", address: "부천시 *** ****", phone: "032-0000-5555" }
    ];
    
    const itemsPerPage = 5;
    const totalItems = doctors.length;
    const maxPages = Math.ceil(totalItems / itemsPerPage);
    const paginationContainer = document.querySelector('.doctorList-ear-pagenation');
    const doctorListContainer = document.getElementById('doctorList');
    let currentPage = 1;

    function renderPage(page) {
        // 기존 리스트 삭제
        doctorListContainer.innerHTML = '';

        const start = (page - 1) * itemsPerPage;
        const end = page * itemsPerPage;

        // 새로운 리스트 추가
        for (let i = start; i < end && i < totalItems; i++) {
            const doctor = doctors[i];
            const doctorDiv = document.createElement('div');
            doctorDiv.className = 'doctorList-container';

            doctorDiv.innerHTML = `
                <a href="./doctorDetail.html">
                    <div class="doctorList-name">
                        의사명 : ${doctor.name} <span>과 : ${doctor.department}</span>
                    </div>
                    <div class="doctorList-HospitalName">병원 주소 : ${doctor.address}</div>
                    <div class="doctorList-MainNumber">${doctor.phone}</div>
                </a>
            `;

            doctorListContainer.appendChild(doctorDiv);
        }

        renderPagination(page);
    }

    function renderPagination(currentPage) {
        paginationContainer.innerHTML = '';

        if (currentPage > 5) {
            const prevLi = document.createElement('li');
            const prevLink = document.createElement('a');
            prevLink.textContent = '<';
            prevLink.href = '#';
            prevLink.addEventListener('click', function(e) {
                e.preventDefault();
                changePage(Math.floor((currentPage - 1) / 5) * 5);
            });
            prevLi.appendChild(prevLink);
            paginationContainer.appendChild(prevLi);
        }

        const startPage = Math.floor((currentPage - 1) / 5) * 5 + 1;
        const endPage = Math.min(startPage + 4, maxPages);

        for (let i = startPage; i <= endPage; i++) {
            const pageLi = document.createElement('li');
            const pageLink = document.createElement('a');
            pageLink.textContent = i;
            pageLink.href = '#';
            if (i === currentPage) {
                pageLink.style.fontWeight = 'bold';
            }
            pageLink.addEventListener('click', function(e) {
                e.preventDefault();
                changePage(i);
            });
            pageLi.appendChild(pageLink);
            paginationContainer.appendChild(pageLi);
        }

        if (endPage < maxPages) {
            const nextLi = document.createElement('li');
            const nextLink = document.createElement('a');
            nextLink.textContent = '>';
            nextLink.href = '#';
            nextLink.addEventListener('click', function(e) {
                e.preventDefault();
                changePage(endPage + 1);
            });
            nextLi.appendChild(nextLink);
            paginationContainer.appendChild(nextLi);
        }
    }

    function changePage(page) {
        currentPage = page;
        renderPage(page);
    }

    // 초기 페이지 렌더링
    renderPage(currentPage);
});
