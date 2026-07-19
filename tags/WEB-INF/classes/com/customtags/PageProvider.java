package com.customtags;
import java.util.*;
public interface PageProvider
{
public List<PageRow>getPage(int pageSize, int pageNumber);
public String getName();
public int getNumberOfPages(int pageSize);
}