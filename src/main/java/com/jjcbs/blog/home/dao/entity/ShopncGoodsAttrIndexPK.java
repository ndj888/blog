package com.jjcbs.blog.home.dao.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/6/19 0019.
 */
public class ShopncGoodsAttrIndexPK implements Serializable {
    private int goodsId;
    private int gcId;
    private int attrValueId;

    @Column(name = "goods_id")
    @Id
    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    @Column(name = "gc_id")
    @Id
    public int getGcId() {
        return gcId;
    }

    public void setGcId(int gcId) {
        this.gcId = gcId;
    }

    @Column(name = "attr_value_id")
    @Id
    public int getAttrValueId() {
        return attrValueId;
    }

    public void setAttrValueId(int attrValueId) {
        this.attrValueId = attrValueId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShopncGoodsAttrIndexPK that = (ShopncGoodsAttrIndexPK) o;

        if (goodsId != that.goodsId) return false;
        if (gcId != that.gcId) return false;
        if (attrValueId != that.attrValueId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = goodsId;
        result = 31 * result + gcId;
        result = 31 * result + attrValueId;
        return result;
    }
}
