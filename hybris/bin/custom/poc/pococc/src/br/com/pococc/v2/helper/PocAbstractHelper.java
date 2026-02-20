package br.com.pococc.v2.helper;

import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.webservicescommons.mapping.DataMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public abstract class PocAbstractHelper
{
    @Resource(name = "dataMapper")
    private DataMapper dataMapper;

    protected PageableData createPageableData(final int currentPage, final int pageSize, final String sort)
    {
        final PageableData pageable = new PageableData();
        pageable.setCurrentPage(currentPage);
        pageable.setPageSize(pageSize);
        pageable.setSort(sort);
        return pageable;
    }

    protected DataMapper getDataMapper()
    {
        return dataMapper;
    }

    protected void setDataMapper(final DataMapper dataMapper)
    {
        this.dataMapper = dataMapper;
    }
}
