package edu.equipment.utils;

import java.util.List;

/**
 * 分页信息
 * 
 *
 */
public class PageInfo<T> {
    // 你页面需要展示的集合
    private List<T> list;
    // 显示的总记录数
    private Integer totalNum;
    // 总页数
    private Integer totalPage;

    // 当前页
    private Integer currentPage;
    // 每页显示的数目 (为了防止硬编码可以写在配置文件中)
    private Integer pageSize;

    // 下面两个就是显示的页码 比如start为1 pageNo为5，那么显示的页码数就是1，2，3，4，5
    private Integer start;
    private Integer pageNo;

    public PageInfo(Integer totalNum, Integer currentPage, Integer pageSize, Integer pageNo) {
        this.totalNum = totalNum;
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        /*this.pageNo = pageNo;*/

        // 计算总页数
        if (totalNum % this.pageSize == 0)
            this.totalPage = totalNum / this.pageSize;
        else
            this.totalPage = (totalNum / this.pageSize) + 1;

        this.start = currentPage;
        // 比如设置了5条，如果总页数都只有四条，那么肯定都是全是显示哦
        if (pageNo+currentPage-1>=this.totalPage)
            this.pageNo = pageNo;
        else this.pageNo = this.totalPage-currentPage+1;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }
    
}