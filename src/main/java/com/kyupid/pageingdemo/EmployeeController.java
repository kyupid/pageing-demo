package com.kyupid.pageingdemo;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeMapper employeeMapper;

    @GetMapping("/employee/pagesample")
    @ResponseBody
    public PageInfo<EmployeeEntity> findPage(HttpServletRequest request) { // pageNum, pageSize 를 넣으면됨
        PageHelper.startPage(request);
        return PageInfo.of(employeeMapper.findAll());
        // 현재 페이지 pageNum
        // 페이지당 수량 private int pageSize ;
        // 현재 페이지 수 private int size ;
        // 현재 페이지의 첫 번째 요소가 데이터베이스에 있는 줄 번호 private long startRow ;
        // 현재 페이지의 마지막 요소가 데이터베이스에 있는 줄 번호 private long endRow ;
        // 전체 페이지 수 private int pages ;
        // 이전 페이지 private int prePage ;
        // 다음 페이지 private int nextPage ;
        // 첫 페이지인지 여부 private boolean isFirstPage = false ;
        // 마지막 페이지인지 여부 private boolean isLastPage = false ;
        // 이전 페이지가 있는지 여부 private boolean hasPreviousPage = false ;
        // 다음 페이지가 있는지 여부 private boolean hasNextPage = false ;
        // 내비게이션 페이지 번호 private int navigatePages ;
        // 모든 내비게이션 페이지 번호  private int [ ] navigatepageNums ;
        // 내비게이션 바의 첫 페이지 private int navigateFirstPage ;
        // 내비게이션 바의 마지막 페이지private int navigateLastPage ;
    }
}
